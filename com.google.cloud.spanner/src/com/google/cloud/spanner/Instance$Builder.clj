(ns com.google.cloud.spanner.Instance$Builder
  "Builder of Instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Instance$Builder]))

(defn set-instance-config-id
  "instance-config-id - `com.google.cloud.spanner.InstanceConfigId`

  returns: `com.google.cloud.spanner.Instance$Builder`"
  (^com.google.cloud.spanner.Instance$Builder [^Instance$Builder this ^com.google.cloud.spanner.InstanceConfigId instance-config-id]
    (-> this (.setInstanceConfigId instance-config-id))))

(defn set-display-name
  "display-name - `java.lang.String`

  returns: `com.google.cloud.spanner.Instance$Builder`"
  (^com.google.cloud.spanner.Instance$Builder [^Instance$Builder this ^java.lang.String display-name]
    (-> this (.setDisplayName display-name))))

(defn set-node-count
  "node-count - `int`

  returns: `com.google.cloud.spanner.Instance$Builder`"
  (^com.google.cloud.spanner.Instance$Builder [^Instance$Builder this ^Integer node-count]
    (-> this (.setNodeCount node-count))))

(defn set-state
  "state - `com.google.cloud.spanner.InstanceInfo$State`

  returns: `com.google.cloud.spanner.Instance$Builder`"
  (^com.google.cloud.spanner.Instance$Builder [^Instance$Builder this ^com.google.cloud.spanner.InstanceInfo$State state]
    (-> this (.setState state))))

(defn add-label
  "key - `java.lang.String`
  value - `java.lang.String`

  returns: `com.google.cloud.spanner.Instance$Builder`"
  (^com.google.cloud.spanner.Instance$Builder [^Instance$Builder this ^java.lang.String key ^java.lang.String value]
    (-> this (.addLabel key value))))

(defn put-all-labels
  "labels - `java.util.Map`

  returns: `com.google.cloud.spanner.Instance$Builder`"
  (^com.google.cloud.spanner.Instance$Builder [^Instance$Builder this ^java.util.Map labels]
    (-> this (.putAllLabels labels))))

(defn build
  "returns: `com.google.cloud.spanner.Instance`"
  (^com.google.cloud.spanner.Instance [^Instance$Builder this]
    (-> this (.build))))

