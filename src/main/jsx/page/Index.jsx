import React from 'react'
import ReactDOM from 'react-dom'

import '../css/style.css'
import '../css/default.scss'

class Index extends React.Component {
    constructor(props) { 
        super(props)
    }

    render() { 
        return (
            <div className="index">
                <h1>Index.jsx 에 의해 렌더링된 페이지123</h1>
            </div>
        )
    }
}

ReactDOM.render(<Index/>, document.getElementById('root'))