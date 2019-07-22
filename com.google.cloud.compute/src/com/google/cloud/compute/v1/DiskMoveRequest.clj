(ns com.google.cloud.compute.v1.DiskMoveRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DiskMoveRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.DiskMoveRequest`

  returns: `com.google.cloud.compute.v1.DiskMoveRequest$Builder`"
  (^com.google.cloud.compute.v1.DiskMoveRequest$Builder [^com.google.cloud.compute.v1.DiskMoveRequest prototype]
    (DiskMoveRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.DiskMoveRequest$Builder []
    (DiskMoveRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.DiskMoveRequest`"
  (^com.google.cloud.compute.v1.DiskMoveRequest []
    (DiskMoveRequest/getDefaultInstance )))

(defn get-destination-zone
  "The URL of the destination zone to move the disk. This can be a full or partial URL. For
   example, the following are all valid URLs to a zone: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone - projects/project/zones/zone
   - zones/zone

  returns: `java.lang.String`"
  (^java.lang.String [^DiskMoveRequest this]
    (-> this (.getDestinationZone))))

(defn get-target-disk
  "The URL of the target disk to move. This can be a full or partial URL. For example, the
   following are all valid URLs to a disk: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk -
   projects/project/zones/zone/disks/disk - zones/zone/disks/disk

  returns: `java.lang.String`"
  (^java.lang.String [^DiskMoveRequest this]
    (-> this (.getTargetDisk))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DiskMoveRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DiskMoveRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^DiskMoveRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^DiskMoveRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DiskMoveRequest this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DiskMoveRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.DiskMoveRequest$Builder`"
  (^com.google.cloud.compute.v1.DiskMoveRequest$Builder [^DiskMoveRequest this]
    (-> this (.toBuilder))))

