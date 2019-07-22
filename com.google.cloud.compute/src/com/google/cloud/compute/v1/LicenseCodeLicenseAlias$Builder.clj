(ns com.google.cloud.compute.v1.LicenseCodeLicenseAlias$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LicenseCodeLicenseAlias$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.LicenseCodeLicenseAlias`

  returns: `com.google.cloud.compute.v1.LicenseCodeLicenseAlias$Builder`"
  (^com.google.cloud.compute.v1.LicenseCodeLicenseAlias$Builder [^LicenseCodeLicenseAlias$Builder this ^com.google.cloud.compute.v1.LicenseCodeLicenseAlias other]
    (-> this (.mergeFrom other))))

(defn get-description
  "[Output Only] Description of this License Code.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCodeLicenseAlias$Builder this]
    (-> this (.getDescription))))

(defn set-description
  "[Output Only] Description of this License Code.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.LicenseCodeLicenseAlias$Builder`"
  (^com.google.cloud.compute.v1.LicenseCodeLicenseAlias$Builder [^LicenseCodeLicenseAlias$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn get-self-link
  "[Output Only] URL of license corresponding to this License Code.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCodeLicenseAlias$Builder this]
    (-> this (.getSelfLink))))

(defn set-self-link
  "[Output Only] URL of license corresponding to this License Code.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.LicenseCodeLicenseAlias$Builder`"
  (^com.google.cloud.compute.v1.LicenseCodeLicenseAlias$Builder [^LicenseCodeLicenseAlias$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn build
  "returns: `com.google.cloud.compute.v1.LicenseCodeLicenseAlias`"
  (^com.google.cloud.compute.v1.LicenseCodeLicenseAlias [^LicenseCodeLicenseAlias$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.LicenseCodeLicenseAlias$Builder`"
  (^com.google.cloud.compute.v1.LicenseCodeLicenseAlias$Builder [^LicenseCodeLicenseAlias$Builder this]
    (-> this (.clone))))

