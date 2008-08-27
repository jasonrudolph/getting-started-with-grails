class Race {
    String name
    String city
    String state
    Float Distance
    Date date
    
    static hasMany = [registrations:Registration]
    
    static constraints = {
        name(blank:false, maxSize:50)
        date()
        city()
        state(inList:["GA", "NC", "SC", "VA"])
    }    
}
