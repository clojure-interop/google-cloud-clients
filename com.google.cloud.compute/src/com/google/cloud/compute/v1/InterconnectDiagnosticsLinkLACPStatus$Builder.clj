(ns com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectDiagnosticsLinkLACPStatus$Builder]))

(defn get-neighbor-system-id
  "System ID of the port on the neighbor?s side of the LACP exchange.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsLinkLACPStatus$Builder this]
    (-> this (.getNeighborSystemId))))

(defn get-google-system-id
  "System ID of the port on Google?s side of the LACP exchange.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsLinkLACPStatus$Builder this]
    (-> this (.getGoogleSystemId))))

(defn set-state
  "The state of a LACP link, which can take one of the following values: - ACTIVE: The link is
   configured and active within the bundle. - DETACHED: The link is not configured within the
   bundle. This means that the rest of the object should be empty.

  state - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder [^InterconnectDiagnosticsLinkLACPStatus$Builder this ^java.lang.String state]
    (-> this (.setState state))))

(defn get-state
  "The state of a LACP link, which can take one of the following values: - ACTIVE: The link is
   configured and active within the bundle. - DETACHED: The link is not configured within the
   bundle. This means that the rest of the object should be empty.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsLinkLACPStatus$Builder this]
    (-> this (.getState))))

(defn set-google-system-id
  "System ID of the port on Google?s side of the LACP exchange.

  google-system-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder [^InterconnectDiagnosticsLinkLACPStatus$Builder this ^java.lang.String google-system-id]
    (-> this (.setGoogleSystemId google-system-id))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus [^InterconnectDiagnosticsLinkLACPStatus$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder [^InterconnectDiagnosticsLinkLACPStatus$Builder this ^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus other]
    (-> this (.mergeFrom other))))

(defn set-neighbor-system-id
  "System ID of the port on the neighbor?s side of the LACP exchange.

  neighbor-system-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder [^InterconnectDiagnosticsLinkLACPStatus$Builder this ^java.lang.String neighbor-system-id]
    (-> this (.setNeighborSystemId neighbor-system-id))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder [^InterconnectDiagnosticsLinkLACPStatus$Builder this]
    (-> this (.clone))))

