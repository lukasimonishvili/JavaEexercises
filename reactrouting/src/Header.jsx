import { Link } from "react-router-dom";
import Styled from "styled-components";
import Navigation from "./Navigations";

const StyledHeader = Styled.header`
    width: 100%;
    height: 60px;
    border-bottom: 1px solid black;
    position: fixed;
    top: 0;
    left: 0;
    background-color: white;
`;

const StyledContainer = Styled.div`
    width: 1100px;
    height: 100%;
    margin: 0 auto;
    display: flex;
    align-items: center;
    justify-content: space-between;
`;

const Header = () => {
  return (
    <StyledHeader>
      <StyledContainer>
        <Link to="/">
          <h1>FineAssLogo</h1>
        </Link>
        <Navigation />
      </StyledContainer>
    </StyledHeader>
  );
};

export default Header;
