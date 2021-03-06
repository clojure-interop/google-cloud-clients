(ns com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient$ListScalingPoliciesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha ScalingPoliciesServiceClient$ListScalingPoliciesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient$ListScalingPoliciesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (ScalingPoliciesServiceClient$ListScalingPoliciesPagedResponse/createAsync context future-response)))

