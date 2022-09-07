import logo from './logo.svg';

import './style.css';

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSMeta" />
                <h1>DSMeta</h1>
                <p>
                    Desenvolvido por
                    <a href="https://www.instagram.com/giordanny_maciel"> @giordanny_maciel</a>
                </p>
            </div>
        </header>
    )
}

export default Header;

