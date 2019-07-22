(ns com.google.cloud.dns.ChangeRequestInfo
  "A class representing an atomic update to a collection of RecordSets within a Zone."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns ChangeRequestInfo]))

(defn *new-builder
  "Returns an empty builder for the ChangeRequestInfo class.

  returns: `com.google.cloud.dns.ChangeRequestInfo$Builder`"
  (^com.google.cloud.dns.ChangeRequestInfo$Builder []
    (ChangeRequestInfo/newBuilder )))

(defn get-status
  "Returns the status of this change request. If the change request has not been applied yet, the
   status is PENDING.

  returns: `com.google.cloud.dns.ChangeRequestInfo$Status`"
  (^com.google.cloud.dns.ChangeRequestInfo$Status [^ChangeRequestInfo this]
    (-> this (.getStatus))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ChangeRequestInfo this]
    (-> this (.toString))))

(defn get-start-time-millis
  "Returns the time when this change request was started by the server.

  returns: `java.lang.Long`"
  (^java.lang.Long [^ChangeRequestInfo this]
    (-> this (.getStartTimeMillis))))

(defn get-deletions
  "Returns the list of RecordSets to be deleted from the zone upon submitting this change
   request.

  returns: `java.util.List<com.google.cloud.dns.RecordSet>`"
  (^java.util.List [^ChangeRequestInfo this]
    (-> this (.getDeletions))))

(defn status
  "Returns the status of this change request. If the change request has not been applied yet, the
   status is PENDING.

  returns: `com.google.cloud.dns.ChangeRequestInfo$Status`"
  (^com.google.cloud.dns.ChangeRequestInfo$Status [^ChangeRequestInfo this]
    (-> this (.status))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ChangeRequestInfo this]
    (-> this (.hashCode))))

(defn get-generated-id
  "Returns the service-generated id for this change request.

  returns: `java.lang.String`"
  (^java.lang.String [^ChangeRequestInfo this]
    (-> this (.getGeneratedId))))

(defn get-additions
  "Returns the list of RecordSets to be added to the zone upon submitting this change
   request.

  returns: `java.util.List<com.google.cloud.dns.RecordSet>`"
  (^java.util.List [^ChangeRequestInfo this]
    (-> this (.getAdditions))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ChangeRequestInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Creates a builder populated with values of this ChangeRequestInfo.

  returns: `com.google.cloud.dns.ChangeRequestInfo$Builder`"
  (^com.google.cloud.dns.ChangeRequestInfo$Builder [^ChangeRequestInfo this]
    (-> this (.toBuilder))))

