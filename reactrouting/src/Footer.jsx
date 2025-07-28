import Styled from "styled-components";

const StyledFooter = Styled.footer`
  width: 100%;
  height: 200px;
  background-color: black;
  text-align: center;

  & > p {
    color: white;
    font-size: 36px;
    padding-bottom: 30px;
    padding-top: 30px;
  }

  & > span {
    color: white;
    font-size: 18px;
    width: 100%;
  }
`;

const Footer = () => {
  return (
    <StyledFooter>
      <p>Best Footer you ever seen</p>
      <span>© 2023 FineAssLogo. All rights reserved.</span>
    </StyledFooter>
  );
};

export default Footer;
