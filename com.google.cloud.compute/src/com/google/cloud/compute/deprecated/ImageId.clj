(ns com.google.cloud.compute.deprecated.ImageId
  "Identity for a Google Compute Engine image."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ImageId]))

(defn *of
  "Returns an image identity given project and image names. The image name must be 1-63 characters
   long and comply with RFC1035. Specifically, the name must match the regular expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character must be a lowercase letter, and all
   following characters must be a dash, lowercase letter, or digit, except the last character,
   which cannot be a dash.

  project - `java.lang.String`
  image - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.ImageId`"
  (^com.google.cloud.compute.deprecated.ImageId [^java.lang.String project ^java.lang.String image]
    (ImageId/of project image))
  (^com.google.cloud.compute.deprecated.ImageId [^java.lang.String image]
    (ImageId/of image)))

(defn get-image
  "Returns the name of the image. The name must be 1-63 characters long and comply with RFC1035.
   Specifically, the name must match the regular expression [a-z]([-a-z0-9]*[a-z0-9])?
   which means the first character must be a lowercase letter, and all following characters must
   be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^ImageId this]
    (-> this (.getImage))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^ImageId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ImageId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ImageId this ^java.lang.Object obj]
    (-> this (.equals obj))))

