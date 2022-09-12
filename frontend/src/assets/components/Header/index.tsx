import logo from './logo.svg';

import './style.css';

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSMeta" />
                <h1>GLL</h1>
                <p>
                    Desenvolvido por
                    <a href="https://www.instagram.com/giordanny_maciel"> Giant League Leader</a>
                </p>
            </div>
        </header>
    )
}

export default Header;

