(ns com.google.cloud.compute.v1.InstancesSetLabelsRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstancesSetLabelsRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstancesSetLabelsRequest`

  returns: `com.google.cloud.compute.v1.InstancesSetLabelsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetLabelsRequest$Builder [^InstancesSetLabelsRequest$Builder this ^com.google.cloud.compute.v1.InstancesSetLabelsRequest other]
    (-> this (.mergeFrom other))))

(defn get-label-fingerprint
  "Fingerprint of the previous set of labels for this resource, used to prevent conflicts.
   Provide the latest fingerprint value when making a request to add or change labels.

  returns: `java.lang.String`"
  (^java.lang.String [^InstancesSetLabelsRequest$Builder this]
    (-> this (.getLabelFingerprint))))

(defn set-label-fingerprint
  "Fingerprint of the previous set of labels for this resource, used to prevent conflicts.
   Provide the latest fingerprint value when making a request to add or change labels.

  label-fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstancesSetLabelsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetLabelsRequest$Builder [^InstancesSetLabelsRequest$Builder this ^java.lang.String label-fingerprint]
    (-> this (.setLabelFingerprint label-fingerprint))))

(defn get-labels-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^InstancesSetLabelsRequest$Builder this]
    (-> this (.getLabelsMap))))

(defn put-all-labels
  "labels - `java.util.Map`

  returns: `com.google.cloud.compute.v1.InstancesSetLabelsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetLabelsRequest$Builder [^InstancesSetLabelsRequest$Builder this ^java.util.Map labels]
    (-> this (.putAllLabels labels))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstancesSetLabelsRequest`"
  (^com.google.cloud.compute.v1.InstancesSetLabelsRequest [^InstancesSetLabelsRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstancesSetLabelsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetLabelsRequest$Builder [^InstancesSetLabelsRequest$Builder this]
    (-> this (.clone))))

