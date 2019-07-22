(ns com.google.cloud.spanner.SessionPoolOptions$Builder
  "Builder for creating SessionPoolOptions."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner SessionPoolOptions$Builder]))

(defn ->builder
  "Constructor."
  (^SessionPoolOptions$Builder []
    (new SessionPoolOptions$Builder )))

(defn set-min-sessions
  "Minimum number of sessions that this pool will always maintain. These will be created eagerly
   in parallel. Defaults to 0.

  min-sessions - `int`

  returns: `com.google.cloud.spanner.SessionPoolOptions$Builder`"
  (^com.google.cloud.spanner.SessionPoolOptions$Builder [^SessionPoolOptions$Builder this ^Integer min-sessions]
    (-> this (.setMinSessions min-sessions))))

(defn set-max-sessions
  "Maximum number of sessions that this pool will have. If current numbers of sessions in the
   pool is less than this and they are all busy, then a new session will be created for any new
   operation. If current number of in use sessions is same as this and a new request comes, pool
   can either block or fail. Defaults to 400.

  max-sessions - `int`

  returns: `com.google.cloud.spanner.SessionPoolOptions$Builder`"
  (^com.google.cloud.spanner.SessionPoolOptions$Builder [^SessionPoolOptions$Builder this ^Integer max-sessions]
    (-> this (.setMaxSessions max-sessions))))

(defn set-max-idle-sessions
  "Maximum number of idle sessions that this pool will maintain. Pool will close any sessions
   beyond this but making sure to always have at least as many sessions as specified by setMinSessions(int). To determine how many sessions are idle we look at maximum number of
   sessions used concurrently over a window of time. Any sessions beyond that are idle. Defaults
   to 0.

  max-idle-sessions - `int`

  returns: `com.google.cloud.spanner.SessionPoolOptions$Builder`"
  (^com.google.cloud.spanner.SessionPoolOptions$Builder [^SessionPoolOptions$Builder this ^Integer max-idle-sessions]
    (-> this (.setMaxIdleSessions max-idle-sessions))))

(defn set-keep-alive-interval-minutes
  "How frequently to keep alive idle sessions. This should be less than 60 since an idle session
   is automatically closed after 60 minutes. Sessions will be kept alive by sending a dummy
   query \"Select 1\". Default value is 30 minutes.

  interval-minutes - `int`

  returns: `com.google.cloud.spanner.SessionPoolOptions$Builder`"
  (^com.google.cloud.spanner.SessionPoolOptions$Builder [^SessionPoolOptions$Builder this ^Integer interval-minutes]
    (-> this (.setKeepAliveIntervalMinutes interval-minutes))))

(defn set-fail-if-pool-exhausted
  "If all sessions are in use and and maxSessions has been reached, fail the request by
   throwing a SpannerException with the error code RESOURCE_EXHAUSTED. Default
   behavior is to block the request.

  returns: `com.google.cloud.spanner.SessionPoolOptions$Builder`"
  (^com.google.cloud.spanner.SessionPoolOptions$Builder [^SessionPoolOptions$Builder this]
    (-> this (.setFailIfPoolExhausted))))

(defn set-block-if-pool-exhausted
  "If all sessions are in use and there is no more room for creating new sessions, block for a
   session to become available. Default behavior is same.

  returns: `com.google.cloud.spanner.SessionPoolOptions$Builder`"
  (^com.google.cloud.spanner.SessionPoolOptions$Builder [^SessionPoolOptions$Builder this]
    (-> this (.setBlockIfPoolExhausted))))

(defn set-write-sessions-fraction
  "Fraction of sessions to be kept prepared for write transactions. This is an optimisation to
   avoid the cost of sending a BeginTransaction() rpc. If all such sessions are in use and a
   write request comes, we will make the BeginTransaction() rpc inline. It must be between 0 and
   1(inclusive).

   Default value is 0.2.

  write-sessions-fraction - `float`

  returns: `com.google.cloud.spanner.SessionPoolOptions$Builder`"
  (^com.google.cloud.spanner.SessionPoolOptions$Builder [^SessionPoolOptions$Builder this ^Float write-sessions-fraction]
    (-> this (.setWriteSessionsFraction write-sessions-fraction))))

(defn build
  "Build a SessionPoolOption object

  returns: `com.google.cloud.spanner.SessionPoolOptions`"
  (^com.google.cloud.spanner.SessionPoolOptions [^SessionPoolOptions$Builder this]
    (-> this (.build))))

