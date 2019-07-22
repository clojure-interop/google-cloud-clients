(ns com.google.cloud.monitoring.v3.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[com.google.cloud.monitoring.v3.AlertPolicyServiceClient$ListAlertPoliciesFixedSizeCollection])
(require '[com.google.cloud.monitoring.v3.AlertPolicyServiceClient$ListAlertPoliciesPage])
(require '[com.google.cloud.monitoring.v3.AlertPolicyServiceClient$ListAlertPoliciesPagedResponse])
(require '[com.google.cloud.monitoring.v3.AlertPolicyServiceClient])
(require '[com.google.cloud.monitoring.v3.AlertPolicyServiceSettings$Builder])
(require '[com.google.cloud.monitoring.v3.AlertPolicyServiceSettings])
(require '[com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersFixedSizeCollection])
(require '[com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersPage])
(require '[com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersPagedResponse])
(require '[com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsFixedSizeCollection])
(require '[com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsPage])
(require '[com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsPagedResponse])
(require '[com.google.cloud.monitoring.v3.GroupServiceClient])
(require '[com.google.cloud.monitoring.v3.GroupServiceSettings$Builder])
(require '[com.google.cloud.monitoring.v3.GroupServiceSettings])
(require '[com.google.cloud.monitoring.v3.MetricServiceClient$ListMetricDescriptorsFixedSizeCollection])
(require '[com.google.cloud.monitoring.v3.MetricServiceClient$ListMetricDescriptorsPage])
(require '[com.google.cloud.monitoring.v3.MetricServiceClient$ListMetricDescriptorsPagedResponse])
(require '[com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsFixedSizeCollection])
(require '[com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsPage])
(require '[com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsPagedResponse])
(require '[com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesFixedSizeCollection])
(require '[com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesPage])
(require '[com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesPagedResponse])
(require '[com.google.cloud.monitoring.v3.MetricServiceClient])
(require '[com.google.cloud.monitoring.v3.MetricServiceSettings$Builder])
(require '[com.google.cloud.monitoring.v3.MetricServiceSettings])
(require '[com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelDescriptorsFixedSizeCollection])
(require '[com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelDescriptorsPage])
(require '[com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelDescriptorsPagedResponse])
(require '[com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelsFixedSizeCollection])
(require '[com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelsPage])
(require '[com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelsPagedResponse])
(require '[com.google.cloud.monitoring.v3.NotificationChannelServiceClient])
(require '[com.google.cloud.monitoring.v3.NotificationChannelServiceSettings$Builder])
(require '[com.google.cloud.monitoring.v3.NotificationChannelServiceSettings])
(require '[com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckConfigsFixedSizeCollection])
(require '[com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckConfigsPage])
(require '[com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckConfigsPagedResponse])
(require '[com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckIpsFixedSizeCollection])
(require '[com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckIpsPage])
(require '[com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckIpsPagedResponse])
(require '[com.google.cloud.monitoring.v3.UptimeCheckServiceClient])
(require '[com.google.cloud.monitoring.v3.UptimeCheckServiceSettings$Builder])
(require '[com.google.cloud.monitoring.v3.UptimeCheckServiceSettings])