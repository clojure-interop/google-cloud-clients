(ns com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient$ListAutoscalingPoliciesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2 AutoscalingPolicyServiceClient$ListAutoscalingPoliciesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient$ListAutoscalingPoliciesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (AutoscalingPolicyServiceClient$ListAutoscalingPoliciesPagedResponse/createAsync context future-response)))

