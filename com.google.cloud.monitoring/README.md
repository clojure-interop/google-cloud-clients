# Bindings for com.google.cloud.monitoring

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.monitoring "1.0.0"]
```

## Class Members Naming Conventions

| Class Member | Java | Clojure |
|:--|:--|:--|
| constructor | new File() | (->file) |
| instance method | getAnyValue() | (get-any-value) |
| instance field | instanceField | (-instance-field) |
| static method | staticMethod() | (*static-method) |
| static field | ANY_STATIC_FIELD | (*-any-static-field) |
| boolean field/method | isExists(), canUse() | (exists?), (can-use?) |

## Classes

- class **com.google.cloud.monitoring.v3.AlertPolicyServiceClient$ListAlertPoliciesFixedSizeCollection**
- class **com.google.cloud.monitoring.v3.AlertPolicyServiceClient$ListAlertPoliciesPage**
- class **com.google.cloud.monitoring.v3.AlertPolicyServiceClient$ListAlertPoliciesPagedResponse**
- class **com.google.cloud.monitoring.v3.AlertPolicyServiceClient**
- class **com.google.cloud.monitoring.v3.AlertPolicyServiceSettings$Builder**
- class **com.google.cloud.monitoring.v3.AlertPolicyServiceSettings**
- class **com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersFixedSizeCollection**
- class **com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersPage**
- class **com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersPagedResponse**
- class **com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsFixedSizeCollection**
- class **com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsPage**
- class **com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsPagedResponse**
- class **com.google.cloud.monitoring.v3.GroupServiceClient**
- class **com.google.cloud.monitoring.v3.GroupServiceSettings$Builder**
- class **com.google.cloud.monitoring.v3.GroupServiceSettings**
- class **com.google.cloud.monitoring.v3.MetricServiceClient$ListMetricDescriptorsFixedSizeCollection**
- class **com.google.cloud.monitoring.v3.MetricServiceClient$ListMetricDescriptorsPage**
- class **com.google.cloud.monitoring.v3.MetricServiceClient$ListMetricDescriptorsPagedResponse**
- class **com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsFixedSizeCollection**
- class **com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsPage**
- class **com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsPagedResponse**
- class **com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesFixedSizeCollection**
- class **com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesPage**
- class **com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesPagedResponse**
- class **com.google.cloud.monitoring.v3.MetricServiceClient**
- class **com.google.cloud.monitoring.v3.MetricServiceSettings$Builder**
- class **com.google.cloud.monitoring.v3.MetricServiceSettings**
- class **com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelDescriptorsFixedSizeCollection**
- class **com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelDescriptorsPage**
- class **com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelDescriptorsPagedResponse**
- class **com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelsFixedSizeCollection**
- class **com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelsPage**
- class **com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelsPagedResponse**
- class **com.google.cloud.monitoring.v3.NotificationChannelServiceClient**
- class **com.google.cloud.monitoring.v3.NotificationChannelServiceSettings$Builder**
- class **com.google.cloud.monitoring.v3.NotificationChannelServiceSettings**
- class **com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckConfigsFixedSizeCollection**
- class **com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckConfigsPage**
- class **com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckConfigsPagedResponse**
- class **com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckIpsFixedSizeCollection**
- class **com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckIpsPage**
- class **com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckIpsPagedResponse**
- class **com.google.cloud.monitoring.v3.UptimeCheckServiceClient**
- class **com.google.cloud.monitoring.v3.UptimeCheckServiceSettings$Builder**
- class **com.google.cloud.monitoring.v3.UptimeCheckServiceSettings**
- class **com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStub**
- class **com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings$Builder**
- class **com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings**
- class **com.google.cloud.monitoring.v3.stub.GroupServiceStub**
- class **com.google.cloud.monitoring.v3.stub.GroupServiceStubSettings$Builder**
- class **com.google.cloud.monitoring.v3.stub.GroupServiceStubSettings**
- class **com.google.cloud.monitoring.v3.stub.GrpcAlertPolicyServiceCallableFactory**
- class **com.google.cloud.monitoring.v3.stub.GrpcAlertPolicyServiceStub**
- class **com.google.cloud.monitoring.v3.stub.GrpcGroupServiceCallableFactory**
- class **com.google.cloud.monitoring.v3.stub.GrpcGroupServiceStub**
- class **com.google.cloud.monitoring.v3.stub.GrpcMetricServiceCallableFactory**
- class **com.google.cloud.monitoring.v3.stub.GrpcMetricServiceStub**
- class **com.google.cloud.monitoring.v3.stub.GrpcNotificationChannelServiceCallableFactory**
- class **com.google.cloud.monitoring.v3.stub.GrpcNotificationChannelServiceStub**
- class **com.google.cloud.monitoring.v3.stub.GrpcUptimeCheckServiceCallableFactory**
- class **com.google.cloud.monitoring.v3.stub.GrpcUptimeCheckServiceStub**
- class **com.google.cloud.monitoring.v3.stub.MetricServiceStub**
- class **com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings$Builder**
- class **com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings**
- class **com.google.cloud.monitoring.v3.stub.NotificationChannelServiceStub**
- class **com.google.cloud.monitoring.v3.stub.NotificationChannelServiceStubSettings$Builder**
- class **com.google.cloud.monitoring.v3.stub.NotificationChannelServiceStubSettings**
- class **com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStub**
- class **com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStubSettings$Builder**
- class **com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
