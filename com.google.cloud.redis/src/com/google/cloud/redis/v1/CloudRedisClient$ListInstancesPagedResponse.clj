(ns com.google.cloud.redis.v1.CloudRedisClient$ListInstancesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.redis.v1 CloudRedisClient$ListInstancesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.redis.v1.CloudRedisClient$ListInstancesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (CloudRedisClient$ListInstancesPagedResponse/createAsync context future-response)))

