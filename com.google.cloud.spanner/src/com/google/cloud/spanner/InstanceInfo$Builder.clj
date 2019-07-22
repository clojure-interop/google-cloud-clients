(ns com.google.cloud.spanner.InstanceInfo$Builder
  "Builder for InstanceInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner InstanceInfo$Builder]))

(defn ->builder
  "Constructor."
  (^InstanceInfo$Builder []
    (new InstanceInfo$Builder )))

(defn set-instance-config-id
  "config-id - `com.google.cloud.spanner.InstanceConfigId`

  returns: `com.google.cloud.spanner.InstanceInfo$Builder`"
  (^com.google.cloud.spanner.InstanceInfo$Builder [^InstanceInfo$Builder this ^com.google.cloud.spanner.InstanceConfigId config-id]
    (-> this (.setInstanceConfigId config-id))))

(defn set-display-name
  "display-name - `java.lang.String`

  returns: `com.google.cloud.spanner.InstanceInfo$Builder`"
  (^com.google.cloud.spanner.InstanceInfo$Builder [^InstanceInfo$Builder this ^java.lang.String display-name]
    (-> this (.setDisplayName display-name))))

(defn set-node-count
  "node-count - `int`

  returns: `com.google.cloud.spanner.InstanceInfo$Builder`"
  (^com.google.cloud.spanner.InstanceInfo$Builder [^InstanceInfo$Builder this ^Integer node-count]
    (-> this (.setNodeCount node-count))))

(defn set-state
  "state - `com.google.cloud.spanner.InstanceInfo$State`

  returns: `com.google.cloud.spanner.InstanceInfo$Builder`"
  (^com.google.cloud.spanner.InstanceInfo$Builder [^InstanceInfo$Builder this ^com.google.cloud.spanner.InstanceInfo$State state]
    (-> this (.setState state))))

(defn add-label
  "key - `java.lang.String`
  value - `java.lang.String`

  returns: `com.google.cloud.spanner.InstanceInfo$Builder`"
  (^com.google.cloud.spanner.InstanceInfo$Builder [^InstanceInfo$Builder this ^java.lang.String key ^java.lang.String value]
    (-> this (.addLabel key value))))

(defn put-all-labels
  "labels - `java.util.Map`

  returns: `com.google.cloud.spanner.InstanceInfo$Builder`"
  (^com.google.cloud.spanner.InstanceInfo$Builder [^InstanceInfo$Builder this ^java.util.Map labels]
    (-> this (.putAllLabels labels))))

(defn build
  "returns: `com.google.cloud.spanner.InstanceInfo`"
  (^com.google.cloud.spanner.InstanceInfo [^InstanceInfo$Builder this]
    (-> this (.build))))

