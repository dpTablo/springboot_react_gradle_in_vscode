import React from 'react'
import ReactDOM from 'react-dom'

class Page2 extends React.Component {
    constructor(props) { 
        super(props)
    }

    render() { 
        return (
            <div className="page2">
                <h1>Page2.jsx 에 의해 렌더링된 페이지</h1>
            </div>
        )
    }
}

ReactDOM.render(<Page2/>, document.getElementById('root'))