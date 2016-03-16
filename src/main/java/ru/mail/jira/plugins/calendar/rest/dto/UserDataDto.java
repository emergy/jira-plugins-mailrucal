package ru.mail.jira.plugins.calendar.rest.dto;

import ru.mail.jira.plugins.calendar.model.UserData;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@SuppressWarnings({"UnusedDeclaration", "FieldCanBeLocal"})
@XmlRootElement
public class UserDataDto {
    @XmlElement
    private String id;
    @XmlElement
    private String displayName;
    @XmlElement
    private String avatarUrl;
    @XmlElement
    private String calendarView;
    @XmlElement
    private boolean hideWeekends;
    @XmlElement
    private String icalUid;
    @XmlElement
    private List<Integer> calendars;
    @XmlElement
    private Long lastLikeFlagShown;

    public UserDataDto() {
    }

    public UserDataDto(UserData userData) {
        if (userData != null) {
            this.id = userData.getUserKey();
            this.calendarView = userData.getDefaultView();
            this.hideWeekends = userData.isHideWeekends();
            this.icalUid = userData.getIcalUid();
        }
    }

    public String getCalendarView() {
        return calendarView;
    }

    public void setCalendarView(String calendarView) {
        this.calendarView = calendarView;
    }

    public boolean isHideWeekends() {
        return hideWeekends;
    }

    public void setHideWeekends(boolean hideWeekends) {
        this.hideWeekends = hideWeekends;
    }

    public String getIcalUid() {
        return icalUid;
    }

    public void setIcalUid(String icalUid) {
        this.icalUid = icalUid;
    }

    public List<Integer> getCalendars() {
        return calendars;
    }

    public void setCalendars(List<Integer> calendars) {
        this.calendars = calendars;
    }

    public Long getLastLikeFlagShown() {
        return lastLikeFlagShown;
    }

    public void setLastLikeFlagShown(Long lastLikeFlagShown) {
        this.lastLikeFlagShown = lastLikeFlagShown;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
