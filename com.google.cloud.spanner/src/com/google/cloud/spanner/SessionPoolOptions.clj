(ns com.google.cloud.spanner.SessionPoolOptions
  "Options for the session pool used by DatabaseClient."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner SessionPoolOptions]))

(defn *new-builder
  "returns: `com.google.cloud.spanner.SessionPoolOptions$Builder`"
  (^com.google.cloud.spanner.SessionPoolOptions$Builder []
    (SessionPoolOptions/newBuilder )))

(defn get-min-sessions
  "returns: `int`"
  (^Integer [^SessionPoolOptions this]
    (-> this (.getMinSessions))))

(defn get-max-sessions
  "returns: `int`"
  (^Integer [^SessionPoolOptions this]
    (-> this (.getMaxSessions))))

(defn get-max-idle-sessions
  "returns: `int`"
  (^Integer [^SessionPoolOptions this]
    (-> this (.getMaxIdleSessions))))

(defn get-write-sessions-fraction
  "returns: `float`"
  (^Float [^SessionPoolOptions this]
    (-> this (.getWriteSessionsFraction))))

(defn get-keep-alive-interval-minutes
  "returns: `int`"
  (^Integer [^SessionPoolOptions this]
    (-> this (.getKeepAliveIntervalMinutes))))

(defn fail-if-pool-exhausted?
  "returns: `boolean`"
  (^Boolean [^SessionPoolOptions this]
    (-> this (.isFailIfPoolExhausted))))

(defn block-if-pool-exhausted?
  "returns: `boolean`"
  (^Boolean [^SessionPoolOptions this]
    (-> this (.isBlockIfPoolExhausted))))

