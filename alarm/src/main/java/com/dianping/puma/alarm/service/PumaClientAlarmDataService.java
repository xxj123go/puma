package com.dianping.puma.alarm.service;

import com.dianping.puma.alarm.model.data.PullTimeDelayAlarmData;
import com.dianping.puma.alarm.model.data.PushTimeDelayAlarmData;

import java.util.Map;

/**
 * Created by xiaotian.li on 16/3/20.
 * Email: lixiaotian07@gmail.com
 */
public interface PumaClientAlarmDataService {

    PullTimeDelayAlarmData findPullTimeDelay(String clientName);

    PushTimeDelayAlarmData findPushTimeDelay(String clientName);

    Map<String, PullTimeDelayAlarmData> findPullTimeDelayAll();

    Map<String, PushTimeDelayAlarmData> findPushTimeDelayAll();

    void replacePullTimeDelay(String clientName, PullTimeDelayAlarmData data);

    void replacePushTimeDelay(String clientName, PushTimeDelayAlarmData data);
}