(ns com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient$ListDatabasesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.admin.database.v1 DatabaseAdminClient$ListDatabasesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient$ListDatabasesPage>`"
  (^com.google.api.core.ApiFuture [^DatabaseAdminClient$ListDatabasesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

