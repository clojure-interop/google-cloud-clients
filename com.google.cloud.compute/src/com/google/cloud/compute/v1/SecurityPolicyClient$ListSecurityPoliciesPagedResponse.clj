(ns com.google.cloud.compute.v1.SecurityPolicyClient$ListSecurityPoliciesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SecurityPolicyClient$ListSecurityPoliciesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.compute.v1.SecurityPolicyClient$ListSecurityPoliciesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (SecurityPolicyClient$ListSecurityPoliciesPagedResponse/createAsync context future-response)))

