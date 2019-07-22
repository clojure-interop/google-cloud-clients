(ns com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectCircuitInfo$Builder]))

(defn get-customer-demarc-id
  "Customer-side demarc ID for this circuit.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectCircuitInfo$Builder this]
    (-> this (.getCustomerDemarcId))))

(defn set-google-demarc-id
  "Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to
   the customer in the LOA.

  google-demarc-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder [^InterconnectCircuitInfo$Builder this ^java.lang.String google-demarc-id]
    (-> this (.setGoogleDemarcId google-demarc-id))))

(defn set-google-circuit-id
  "Google-assigned unique ID for this circuit. Assigned at circuit turn-up.

  google-circuit-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder [^InterconnectCircuitInfo$Builder this ^java.lang.String google-circuit-id]
    (-> this (.setGoogleCircuitId google-circuit-id))))

(defn get-google-circuit-id
  "Google-assigned unique ID for this circuit. Assigned at circuit turn-up.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectCircuitInfo$Builder this]
    (-> this (.getGoogleCircuitId))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectCircuitInfo`"
  (^com.google.cloud.compute.v1.InterconnectCircuitInfo [^InterconnectCircuitInfo$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InterconnectCircuitInfo`

  returns: `com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder [^InterconnectCircuitInfo$Builder this ^com.google.cloud.compute.v1.InterconnectCircuitInfo other]
    (-> this (.mergeFrom other))))

(defn set-customer-demarc-id
  "Customer-side demarc ID for this circuit.

  customer-demarc-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder [^InterconnectCircuitInfo$Builder this ^java.lang.String customer-demarc-id]
    (-> this (.setCustomerDemarcId customer-demarc-id))))

(defn get-google-demarc-id
  "Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to
   the customer in the LOA.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectCircuitInfo$Builder this]
    (-> this (.getGoogleDemarcId))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder [^InterconnectCircuitInfo$Builder this]
    (-> this (.clone))))

