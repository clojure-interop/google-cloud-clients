(ns com.google.cloud.compute.v1.SnapshotClient$ListSnapshotsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SnapshotClient$ListSnapshotsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.compute.v1.SnapshotClient$ListSnapshotsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (SnapshotClient$ListSnapshotsPagedResponse/createAsync context future-response)))

