package step

import core.Event
import core.ScheduleStrategy
import cucumber.api.PendingException
import groovy.transform.Field

this.metaClass.mixin(cucumber.api.groovy.EN)

@Field event
@Field nextSchedule
@Field scheduleStrategy

Given(~/^a new event$/) { ->
    event = new Event()
    scheduleStrategy = new ScheduleStrategy()
}

When(~/^ask for the next schedule$/) { ->
    nextSchedule = event.nextSchedule(scheduleStrategy) as String
}

Then(~/^it should be today$/) { ->
    assert nextSchedule == new Date() as String
}

Given(~/^a new event with the first schedule is today$/) { ->
    event = new Event()
    nextSchedule = event.nextSchedule(scheduleStrategy)
    event.appendHistory(nextSchedule)
}

Then(~/^it should be tomorrow$/) { ->
    assert nextSchedule == (new Date() + 1) as String
}