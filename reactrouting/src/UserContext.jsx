import { createContext, useContext, useState } from "react";

const UserContext = createContext();

export const useUser = () => useContext(UserContext);

export const UserProvider = ({ children }) => {
  const [user, setUser] = useState(
    window.localStorage.getItem("user")
      ? JSON.parse(window.localStorage.getItem("user"))
      : null
  );

  const login = (userData) => {
    setUser(userData);
    window.localStorage.setItem("user", JSON.stringify(userData));
  };

  const logout = () => {
    setUser(null);
    window.localStorage.removeItem("user");
  };

  return (
    <UserContext.Provider value={{ user, login, logout }}>
      {children}
    </UserContext.Provider>
  );
};
