 
listView('dosakdoaksdoa Jobs') {
    description('dosakdoaksdoa Jobs')
    jobs {
        regex('dosakdoaksdoa_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
