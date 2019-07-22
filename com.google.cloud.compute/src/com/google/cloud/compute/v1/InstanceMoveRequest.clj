(ns com.google.cloud.compute.v1.InstanceMoveRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceMoveRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceMoveRequest`

  returns: `com.google.cloud.compute.v1.InstanceMoveRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceMoveRequest$Builder [^com.google.cloud.compute.v1.InstanceMoveRequest prototype]
    (InstanceMoveRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceMoveRequest$Builder []
    (InstanceMoveRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceMoveRequest`"
  (^com.google.cloud.compute.v1.InstanceMoveRequest []
    (InstanceMoveRequest/getDefaultInstance )))

(defn get-destination-zone
  "The URL of the destination zone to move the instance. This can be a full or partial URL. For
   example, the following are all valid URLs to a zone: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone - projects/project/zones/zone
   - zones/zone

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceMoveRequest this]
    (-> this (.getDestinationZone))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceMoveRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceMoveRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceMoveRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceMoveRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-target-instance
  "The URL of the target instance to move. This can be a full or partial URL. For example, the
   following are all valid URLs to an instance: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance -
   projects/project/zones/zone/instances/instance - zones/zone/instances/instance

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceMoveRequest this]
    (-> this (.getTargetInstance))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceMoveRequest this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceMoveRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceMoveRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceMoveRequest$Builder [^InstanceMoveRequest this]
    (-> this (.toBuilder))))

