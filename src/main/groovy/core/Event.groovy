package core

class Event {
    List<Date> histroies = []

    Date nextSchedule(ScheduleStrategy strategy) {
        strategy.caculate(histroies)
    }

    void appendHistory(Date date) {
        histroies << date
    }

    @Override String toString() {
        histroies
    }
}
