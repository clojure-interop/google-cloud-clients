(ns com.google.cloud.compute.deprecated.LicenseId
  "Identity for a Google Compute Engine license."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated LicenseId]))

(defn *of
  "Returns a license identity given project and license names.

  project - `java.lang.String`
  license - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.LicenseId`"
  (^com.google.cloud.compute.deprecated.LicenseId [^java.lang.String project ^java.lang.String license]
    (LicenseId/of project license))
  (^com.google.cloud.compute.deprecated.LicenseId [^java.lang.String license]
    (LicenseId/of license)))

(defn get-license
  "Returns the name of the license.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseId this]
    (-> this (.getLicense))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LicenseId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LicenseId this ^java.lang.Object obj]
    (-> this (.equals obj))))

