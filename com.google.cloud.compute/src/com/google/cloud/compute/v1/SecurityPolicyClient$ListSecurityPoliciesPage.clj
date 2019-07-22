(ns com.google.cloud.compute.v1.SecurityPolicyClient$ListSecurityPoliciesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SecurityPolicyClient$ListSecurityPoliciesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.compute.v1.SecurityPolicyClient$ListSecurityPoliciesPage>`"
  (^com.google.api.core.ApiFuture [^SecurityPolicyClient$ListSecurityPoliciesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

