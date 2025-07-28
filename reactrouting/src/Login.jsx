import Styled from "styled-components";
import usersData from "./assets/users.json";
import { useEffect, useState } from "react";
import { useUser } from "./UserContext";
import { useNavigate } from "react-router-dom";

const StyledLogin = Styled.div`
  width: 770px;
  margin: 0 auto;
  text-align: center;
  padding-top: 100px;

  & p {
    color: ${(props) => (props.iserror ? "red" : "transparent")};
  }
`;

const LoginPage = () => {
  const [isError, setIsError] = useState(false);
  const { login, user } = useUser();
  const navigate = useNavigate();

  useEffect(() => {
    if (!!user) {
      navigate("/");
    }
  }, []);

  const handleSubmit = (event) => {
    event.preventDefault();

    for (let user of usersData) {
      if (
        user.userName === event.target.username.value &&
        user.password === event.target.password.value
      ) {
        setIsError(false);
        login(user);
        navigate("/");
        return;
      }
    }

    setIsError(true);
  };

  return (
    <StyledLogin iserror={isError}>
      <h1>Login</h1>
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="username">Username:</label>
          <input type="text" id="username" name="username" required />
        </div>
        <div>
          <label htmlFor="password">Password:</label>
          <input type="password" id="password" name="password" required />
        </div>
        <p>Worng password or username</p>
        <button type="submit">Login</button>
      </form>
    </StyledLogin>
  );
};

export default LoginPage;
