(ns com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha AllocationPoliciesServiceClient$ListAllocationPoliciesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (AllocationPoliciesServiceClient$ListAllocationPoliciesPagedResponse/createAsync context future-response)))

