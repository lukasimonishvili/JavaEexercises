import { Link } from "react-router-dom";
import Styled from "styled-components";
import { useUser } from "./UserContext";

const StyledNavigation = Styled.nav`
  display: flex;
  align-items: center;

  & > a, button {
    margin-left: 20px;
    border: none;
    background: transparent;
    outline: transparent;
    cursor: pointer;

    &:hover {
      text-decoration: underline;
    }

    &:first-child {
      margin-left: 0;
    }
  }
`;

const Navigation = () => {
  const { user, logout } = useUser();

  return (
    <StyledNavigation>
      {!!user ? (
        <>
          <Link to="/courses">Courses</Link>
          {user.role === "admin" && <Link to="/admin">Admin</Link>}
          <button onClick={logout}>Logout</button>
        </>
      ) : (
        <>
          <Link to="/login">Log in</Link>
        </>
      )}
    </StyledNavigation>
  );
};

export default Navigation;
