(ns com.google.cloud.redis.v1beta1.CloudRedisClient$ListInstancesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.redis.v1beta1 CloudRedisClient$ListInstancesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.redis.v1beta1.CloudRedisClient$ListInstancesPage>`"
  (^com.google.api.core.ApiFuture [^CloudRedisClient$ListInstancesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

