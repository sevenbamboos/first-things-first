package core

class ScheduleStrategy {

    Date caculate(List<Date> histories) {
        if (!histories) {
            return new Date()
        }
        histories[-1] + 1
    }

}
