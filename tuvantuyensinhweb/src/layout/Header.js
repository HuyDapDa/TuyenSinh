import { useContext, useEffect, useState } from 'react';
import { Container, Navbar, Nav, Button, NavDropdown, Form, FormControl, Image } from 'react-bootstrap';
import { Link,useNavigate } from 'react-router-dom';
import Apis, { endpoints } from '../configs/Apis';
import MySpinner from './MySpinner';
import {MyUserContext } from '../App';

const Header= () => {
  const [user, dispatch] = useContext(MyUserContext);
  const [admissions,  setAdmissions] = useState(null);
  const [kw, setKw] = useState("");
  const nav = useNavigate();

  const loadCates = async () => {
    let res = await Apis.get(endpoints['admissions'])
    setAdmissions(res.data);
    }
  useEffect(() => {
    loadCates();
  }, [])
  const search = (evt) => {
    evt.preventDefault();
    nav(`/?kw=${kw}`)
}

const logout = () => {
    dispatch({
        "type": "logout"
    })
}
if (admissions === null)
    return <MySpinner />;
    
  return (
    <section className="mb-3 mt-3">
      <Container>
        <div className="row justify-content-between">
          <div className="col-md-8 order-md-last">
            <div className="row">
              <div className="col-md-6 text-center">
                <Navbar.Brand as={Link} to="/">
                  CỔNG THÔNG TIN TƯ VẤN TUYỂN SINH<br />ĐẠI HỌC MỞ THÀNH PHỐ HỒ CHÍ MINH
                </Navbar.Brand>
              </div>
              <div className="col-md-6 d-md-flex justify-content-end mb-md-0 mb-3">
                <Form className="searchform order-lg-last" onSubmit={search} inline>
                  <div className="form-group d-flex">
                    <FormControl type="text" value={kw}  onChange={e => setKw(e.target.value)} 
                                className="form-control pl-3" placeholder="Search " name="kw" />
                    <Button type="submit" className="form-control search">
                      <span className="fa fa-search"></span>
                    </Button>
                  </div>
                </Form>
              </div>
            </div>
          </div>
          <div className="col-md-4 d-flex">
            <div className="social-media">
              <p className="mb-0 d-flex">
                <Image
                  src="https://res.cloudinary.com/dev7q6f9g/image/upload/v1693319387/norzb2fl19qkalnqtmn5.png"
                  alt="Social Media Logo"
                  width={60}
                  height={40}
                />
              </p>
            </div>
          </div>
        </div>
      </Container>

      <Navbar expand="lg" variant="dark" className="ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
        <Container fluid>
          <Navbar.Toggle aria-controls="ftco-nav">
            <span className="fa fa-bars"></span> Menu
          </Navbar.Toggle>
          <Navbar.Collapse id="ftco-nav">
            <Nav className="navbar-nav m-auto">
              <Nav.Item className="nav-item active">
                <Nav.Link as={Link} to="/" className="nav-link">
                  Trang Chủ
                </Nav.Link>
              </Nav.Item>
              <NavDropdown title="Hệ" id="dropdown04">
                        {admissions.map(a => {
                            let h = `/?admissionId=${a.idadmission}`;
                            return <Link className="dropdown-item" to={h}  key={a.idadmission}>{a.typeoftraining}</Link>
                        })}   
              </NavDropdown>
              <NavDropdown title="Khoa" id="dropdown04">
 
              </NavDropdown>
              <Nav.Item className="nav-item">
                <Nav.Link as={Link} to="/school" className="nav-link">
                  Giới thiệu
                </Nav.Link>
              </Nav.Item>
              <Nav.Item className="nav-item">
                <Nav.Link as={Link} to="/benmarks" className="nav-link">
                  Điểm chuẩn
                </Nav.Link>
              </Nav.Item>
            </Nav>
            <Nav className="navbar-nav ml-auto">
              {user === null ? <>
                        <Link className="nav-link text-danger" to="/login">Đăng nhập</Link>
                        <Link className="nav-link text-danger" to="/register">Đăng ký</Link>
                        
                       
                    </>: <>
                        <Link className="nav-link text-danger" to="/">Chào {user.username}!</Link>
                        <Button variant="secondary" onClick={logout}>Đăng xuất</Button>
                    </>}
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
    </section>
  );
}

export default Header;