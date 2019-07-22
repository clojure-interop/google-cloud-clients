(ns com.google.cloud.compute.v1.NetworksRemovePeeringRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworksRemovePeeringRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NetworksRemovePeeringRequest`

  returns: `com.google.cloud.compute.v1.NetworksRemovePeeringRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworksRemovePeeringRequest$Builder [^NetworksRemovePeeringRequest$Builder this ^com.google.cloud.compute.v1.NetworksRemovePeeringRequest other]
    (-> this (.mergeFrom other))))

(defn get-name
  "Name of the peering, which should conform to RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworksRemovePeeringRequest$Builder this]
    (-> this (.getName))))

(defn set-name
  "Name of the peering, which should conform to RFC1035.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworksRemovePeeringRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworksRemovePeeringRequest$Builder [^NetworksRemovePeeringRequest$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn build
  "returns: `com.google.cloud.compute.v1.NetworksRemovePeeringRequest`"
  (^com.google.cloud.compute.v1.NetworksRemovePeeringRequest [^NetworksRemovePeeringRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NetworksRemovePeeringRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworksRemovePeeringRequest$Builder [^NetworksRemovePeeringRequest$Builder this]
    (-> this (.clone))))

