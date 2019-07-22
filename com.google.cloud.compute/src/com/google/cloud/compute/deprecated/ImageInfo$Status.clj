(ns com.google.cloud.compute.deprecated.ImageInfo$Status
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ImageInfo$Status]))

(def FAILED
  "Enum Constant.

  Image creation failed. The image can not be used.

  type: com.google.cloud.compute.deprecated.ImageInfo$Status"
  ImageInfo$Status/FAILED)

(def PENDING
  "Enum Constant.

  Image creation is pending. The image is not ready to be used yet.

  type: com.google.cloud.compute.deprecated.ImageInfo$Status"
  ImageInfo$Status/PENDING)

(def READY
  "Enum Constant.

  Image has been created and is ready for use.

  type: com.google.cloud.compute.deprecated.ImageInfo$Status"
  ImageInfo$Status/READY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ImageInfo.Status c : ImageInfo.Status.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.ImageInfo$Status[]`"
  ([]
    (ImageInfo$Status/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.ImageInfo$Status`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.ImageInfo$Status [^java.lang.String name]
    (ImageInfo$Status/valueOf name)))

