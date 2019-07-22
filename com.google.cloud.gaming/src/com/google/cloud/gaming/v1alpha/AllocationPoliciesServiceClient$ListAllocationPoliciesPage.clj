(ns com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha AllocationPoliciesServiceClient$ListAllocationPoliciesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesPage>`"
  (^com.google.api.core.ApiFuture [^AllocationPoliciesServiceClient$ListAllocationPoliciesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

