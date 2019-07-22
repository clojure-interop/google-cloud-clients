(ns com.google.cloud.compute.v1.Scheduling
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Scheduling]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Scheduling`

  returns: `com.google.cloud.compute.v1.Scheduling$Builder`"
  (^com.google.cloud.compute.v1.Scheduling$Builder [^com.google.cloud.compute.v1.Scheduling prototype]
    (Scheduling/newBuilder prototype))
  (^com.google.cloud.compute.v1.Scheduling$Builder []
    (Scheduling/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Scheduling`"
  (^com.google.cloud.compute.v1.Scheduling []
    (Scheduling/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Scheduling this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Scheduling this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Scheduling this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-preemptible?
  "Defines whether the instance is preemptible. This can only be set during instance creation, it
   cannot be set or changed after the instance has been created.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Scheduling this]
    (-> this (.getPreemptible))))

(defn get-on-host-maintenance
  "Defines the maintenance behavior for this instance. For standard instances, the default
   behavior is MIGRATE. For preemptible instances, the default and only possible behavior is
   TERMINATE. For more information, see Setting Instance Scheduling Options.

  returns: `java.lang.String`"
  (^java.lang.String [^Scheduling this]
    (-> this (.getOnHostMaintenance))))

(defn get-node-affinities-list
  "A set of node affinity and anti-affinity.

  returns: `java.util.List<com.google.cloud.compute.v1.SchedulingNodeAffinity>`"
  (^java.util.List [^Scheduling this]
    (-> this (.getNodeAffinitiesList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Scheduling this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Scheduling this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Scheduling this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Scheduling$Builder`"
  (^com.google.cloud.compute.v1.Scheduling$Builder [^Scheduling this]
    (-> this (.toBuilder))))

(defn get-automatic-restart?
  "Specifies whether the instance should be automatically restarted if it is terminated by Compute
   Engine (not terminated by a user). You can only set the automatic restart option for standard
   instances. Preemptible instances cannot be automatically restarted.

   By default, this is set to true so an instance is automatically restarted if it is
   terminated by Compute Engine.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Scheduling this]
    (-> this (.getAutomaticRestart))))

