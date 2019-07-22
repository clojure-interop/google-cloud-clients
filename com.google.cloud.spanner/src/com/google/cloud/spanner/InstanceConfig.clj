(ns com.google.cloud.spanner.InstanceConfig
  "Represents a Cloud Spanner instance config.InstanceConfig adds a layer of service related
  functionality over InstanceConfigInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner InstanceConfig]))

(defn ->instance-config
  "Constructor.

  id - `com.google.cloud.spanner.InstanceConfigId`
  display-name - `java.lang.String`
  client - `com.google.cloud.spanner.InstanceAdminClient`"
  (^InstanceConfig [^com.google.cloud.spanner.InstanceConfigId id ^java.lang.String display-name ^com.google.cloud.spanner.InstanceAdminClient client]
    (new InstanceConfig id display-name client)))

(defn reload
  "Gets the current state of this instance config.

  returns: `com.google.cloud.spanner.InstanceConfig`"
  (^com.google.cloud.spanner.InstanceConfig [^InstanceConfig this]
    (-> this (.reload))))

