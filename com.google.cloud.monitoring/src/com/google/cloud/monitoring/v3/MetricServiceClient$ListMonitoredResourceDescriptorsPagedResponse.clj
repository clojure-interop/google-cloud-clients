(ns com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 MetricServiceClient$ListMonitoredResourceDescriptorsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (MetricServiceClient$ListMonitoredResourceDescriptorsPagedResponse/createAsync context future-response)))

