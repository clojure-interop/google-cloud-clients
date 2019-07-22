(ns com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 GroupServiceClient$ListGroupMembersPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (GroupServiceClient$ListGroupMembersPagedResponse/createAsync context future-response)))

