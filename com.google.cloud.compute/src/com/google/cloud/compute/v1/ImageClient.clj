(ns com.google.cloud.compute.v1.ImageClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ImageClient imageClient = ImageClient.create()) {
    ProjectGlobalImageName image = ProjectGlobalImageName.of(\"[PROJECT]\", \"[IMAGE]\");
    Operation response = imageClient.deleteImage(image);
  }

  Note: close() needs to be called on the imageClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of ImageSettings to create(). For
  example:

  To customize credentials:



  ImageSettings imageSettings =
      ImageSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ImageClient imageClient =
      ImageClient.create(imageSettings);

  To customize the endpoint:



  ImageSettings imageSettings =
      ImageSettings.newBuilder().setEndpoint(myEndpoint).build();
  ImageClient imageClient =
      ImageClient.create(imageSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ImageClient]))

(defn *create
  "Constructs an instance of ImageClient, using the given settings. The channels are created based
   on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.ImageSettings`

  returns: `com.google.cloud.compute.v1.ImageClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.ImageClient [^com.google.cloud.compute.v1.ImageSettings settings]
    (ImageClient/create settings))
  (^com.google.cloud.compute.v1.ImageClient []
    (ImageClient/create )))

(defn get-image
  "Returns the specified image. Gets a list of available images by making a list() request.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     ProjectGlobalImageName image = ProjectGlobalImageName.of(\"[PROJECT]\", \"[IMAGE]\");
     Image response = imageClient.getImage(image);
   }

  image - Name of the image resource to return. - `com.google.cloud.compute.v1.ProjectGlobalImageName`

  returns: `com.google.cloud.compute.v1.Image`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Image [^ImageClient this ^com.google.cloud.compute.v1.ProjectGlobalImageName image]
    (-> this (.getImage image))))

(defn deprecate-image
  "Sets the deprecation status of an image.

   If an empty request body is given, clears the deprecation status instead.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     ProjectGlobalImageName image = ProjectGlobalImageName.of(\"[PROJECT]\", \"[IMAGE]\");
     DeprecationStatus deprecationStatusResource = DeprecationStatus.newBuilder().build();
     Operation response = imageClient.deprecateImage(image, deprecationStatusResource);
   }

  image - Image name. - `com.google.cloud.compute.v1.ProjectGlobalImageName`
  deprecation-status-resource - Deprecation status for a public resource. - `com.google.cloud.compute.v1.DeprecationStatus`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ImageClient this ^com.google.cloud.compute.v1.ProjectGlobalImageName image ^com.google.cloud.compute.v1.DeprecationStatus deprecation-status-resource]
    (-> this (.deprecateImage image deprecation-status-resource)))
  (^com.google.cloud.compute.v1.Operation [^ImageClient this ^com.google.cloud.compute.v1.DeprecateImageHttpRequest request]
    (-> this (.deprecateImage request))))

(defn deprecate-image-callable
  "Sets the deprecation status of an image.

   If an empty request body is given, clears the deprecation status instead.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     String formattedImage = ProjectGlobalImageName.format(\"[PROJECT]\", \"[IMAGE]\");
     DeprecationStatus deprecationStatusResource = DeprecationStatus.newBuilder().build();
     DeprecateImageHttpRequest request = DeprecateImageHttpRequest.newBuilder()
       .setImage(formattedImage)
       .setDeprecationStatusResource(deprecationStatusResource)
       .build();
     ApiFuture<Operation> future = imageClient.deprecateImageCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeprecateImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageClient this]
    (-> this (.deprecateImageCallable))))

(defn list-images-paged-callable
  "Retrieves the list of custom images available to the specified project. Custom images are
   images you create that belong to your project. This method does not get any images that belong
   to other projects, including publicly-available images, like Debian 8. If you want to get a
   list of publicly-available images, use this method to make a request to the respective image
   project, such as debian-cloud or windows-cloud.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListImagesHttpRequest request = ListImagesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListImagesPagedResponse> future = imageClient.listImagesPagedCallable().futureCall(request);
     // Do something
     for (Image element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListImagesHttpRequest,com.google.cloud.compute.v1.ImageClient$ListImagesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageClient this]
    (-> this (.listImagesPagedCallable))))

(defn get-iam-policy-image
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     ProjectGlobalImageResourceName resource = ProjectGlobalImageResourceName.of(\"[PROJECT]\", \"[RESOURCE]\");
     Policy response = imageClient.getIamPolicyImage(resource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectGlobalImageResourceName`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^ImageClient this ^com.google.cloud.compute.v1.ProjectGlobalImageResourceName resource]
    (-> this (.getIamPolicyImage resource))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.ImageSettings`"
  (^com.google.cloud.compute.v1.ImageSettings [^ImageClient this]
    (-> this (.getSettings))))

(defn set-labels-image
  "Sets the labels on an image. To learn more about labels, read the Labeling Resources
   documentation.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     ProjectGlobalImageResourceName resource = ProjectGlobalImageResourceName.of(\"[PROJECT]\", \"[RESOURCE]\");
     GlobalSetLabelsRequest globalSetLabelsRequestResource = GlobalSetLabelsRequest.newBuilder().build();
     Operation response = imageClient.setLabelsImage(resource, globalSetLabelsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectGlobalImageResourceName`
  global-set-labels-request-resource - `com.google.cloud.compute.v1.GlobalSetLabelsRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ImageClient this ^com.google.cloud.compute.v1.ProjectGlobalImageResourceName resource ^com.google.cloud.compute.v1.GlobalSetLabelsRequest global-set-labels-request-resource]
    (-> this (.setLabelsImage resource global-set-labels-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^ImageClient this ^com.google.cloud.compute.v1.SetLabelsImageHttpRequest request]
    (-> this (.setLabelsImage request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.ImageStub`"
  ([^ImageClient this]
    (-> this (.getStub))))

(defn test-iam-permissions-image-callable
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     String formattedResource = ProjectGlobalImageResourceName.format(\"[PROJECT]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestIamPermissionsImageHttpRequest request = TestIamPermissionsImageHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setTestPermissionsRequestResource(testPermissionsRequestResource)
       .build();
     ApiFuture<TestPermissionsResponse> future = imageClient.testIamPermissionsImageCallable().futureCall(request);
     // Do something
     TestPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsImageHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageClient this]
    (-> this (.testIamPermissionsImageCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ImageClient this]
    (-> this (.isShutdown))))

(defn list-images
  "Retrieves the list of custom images available to the specified project. Custom images are
   images you create that belong to your project. This method does not get any images that belong
   to other projects, including publicly-available images, like Debian 8. If you want to get a
   list of publicly-available images, use this method to make a request to the respective image
   project, such as debian-cloud or windows-cloud.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (Image element : imageClient.listImages(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.ImageClient$ListImagesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.ImageClient$ListImagesPagedResponse [^ImageClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listImages project))))

(defn test-iam-permissions-image
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     ProjectGlobalImageResourceName resource = ProjectGlobalImageResourceName.of(\"[PROJECT]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestPermissionsResponse response = imageClient.testIamPermissionsImage(resource, testPermissionsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectGlobalImageResourceName`
  test-permissions-request-resource - `com.google.cloud.compute.v1.TestPermissionsRequest`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^ImageClient this ^com.google.cloud.compute.v1.ProjectGlobalImageResourceName resource ^com.google.cloud.compute.v1.TestPermissionsRequest test-permissions-request-resource]
    (-> this (.testIamPermissionsImage resource test-permissions-request-resource)))
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^ImageClient this ^com.google.cloud.compute.v1.TestIamPermissionsImageHttpRequest request]
    (-> this (.testIamPermissionsImage request))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ImageClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^ImageClient this]
    (-> this (.shutdown))))

(defn delete-image
  "Deletes the specified image.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     ProjectGlobalImageName image = ProjectGlobalImageName.of(\"[PROJECT]\", \"[IMAGE]\");
     Operation response = imageClient.deleteImage(image);
   }

  image - Name of the image resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalImageName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ImageClient this ^com.google.cloud.compute.v1.ProjectGlobalImageName image]
    (-> this (.deleteImage image))))

(defn set-iam-policy-image
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     ProjectGlobalImageResourceName resource = ProjectGlobalImageResourceName.of(\"[PROJECT]\", \"[RESOURCE]\");
     GlobalSetPolicyRequest globalSetPolicyRequestResource = GlobalSetPolicyRequest.newBuilder().build();
     Policy response = imageClient.setIamPolicyImage(resource, globalSetPolicyRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectGlobalImageResourceName`
  global-set-policy-request-resource - `com.google.cloud.compute.v1.GlobalSetPolicyRequest`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^ImageClient this ^com.google.cloud.compute.v1.ProjectGlobalImageResourceName resource ^com.google.cloud.compute.v1.GlobalSetPolicyRequest global-set-policy-request-resource]
    (-> this (.setIamPolicyImage resource global-set-policy-request-resource)))
  (^com.google.cloud.compute.v1.Policy [^ImageClient this ^com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest request]
    (-> this (.setIamPolicyImage request))))

(defn set-labels-image-callable
  "Sets the labels on an image. To learn more about labels, read the Labeling Resources
   documentation.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     String formattedResource = ProjectGlobalImageResourceName.format(\"[PROJECT]\", \"[RESOURCE]\");
     GlobalSetLabelsRequest globalSetLabelsRequestResource = GlobalSetLabelsRequest.newBuilder().build();
     SetLabelsImageHttpRequest request = SetLabelsImageHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setGlobalSetLabelsRequestResource(globalSetLabelsRequestResource)
       .build();
     ApiFuture<Operation> future = imageClient.setLabelsImageCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetLabelsImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageClient this]
    (-> this (.setLabelsImageCallable))))

(defn get-from-family-image-callable
  "Returns the latest image that is part of an image family and is not deprecated.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     String formattedFamily = ProjectGlobalImageFamilyName.format(\"[PROJECT]\", \"[FAMILY]\");
     GetFromFamilyImageHttpRequest request = GetFromFamilyImageHttpRequest.newBuilder()
       .setFamily(formattedFamily)
       .build();
     ApiFuture<Image> future = imageClient.getFromFamilyImageCallable().futureCall(request);
     // Do something
     Image response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetFromFamilyImageHttpRequest,com.google.cloud.compute.v1.Image>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageClient this]
    (-> this (.getFromFamilyImageCallable))))

(defn insert-image-callable
  "Creates an image in the specified project using the data included in the request.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     Boolean forceCreate = false;
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     Image imageResource = Image.newBuilder().build();
     InsertImageHttpRequest request = InsertImageHttpRequest.newBuilder()
       .setForceCreate(forceCreate)
       .setProject(formattedProject)
       .setImageResource(imageResource)
       .build();
     ApiFuture<Operation> future = imageClient.insertImageCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageClient this]
    (-> this (.insertImageCallable))))

(defn close
  ""
  ([^ImageClient this]
    (-> this (.close))))

(defn list-images-callable
  "Retrieves the list of custom images available to the specified project. Custom images are
   images you create that belong to your project. This method does not get any images that belong
   to other projects, including publicly-available images, like Debian 8. If you want to get a
   list of publicly-available images, use this method to make a request to the respective image
   project, such as debian-cloud or windows-cloud.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListImagesHttpRequest request = ListImagesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       ImageList response = imageClient.listImagesCallable().call(request);
       for (Image element : response.getItemsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListImagesHttpRequest,com.google.cloud.compute.v1.ImageList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageClient this]
    (-> this (.listImagesCallable))))

(defn get-from-family-image
  "Returns the latest image that is part of an image family and is not deprecated.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     ProjectGlobalImageFamilyName family = ProjectGlobalImageFamilyName.of(\"[PROJECT]\", \"[FAMILY]\");
     Image response = imageClient.getFromFamilyImage(family);
   }

  family - Name of the image family to search for. - `com.google.cloud.compute.v1.ProjectGlobalImageFamilyName`

  returns: `com.google.cloud.compute.v1.Image`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Image [^ImageClient this ^com.google.cloud.compute.v1.ProjectGlobalImageFamilyName family]
    (-> this (.getFromFamilyImage family))))

(defn set-iam-policy-image-callable
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     String formattedResource = ProjectGlobalImageResourceName.format(\"[PROJECT]\", \"[RESOURCE]\");
     GlobalSetPolicyRequest globalSetPolicyRequestResource = GlobalSetPolicyRequest.newBuilder().build();
     SetIamPolicyImageHttpRequest request = SetIamPolicyImageHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setGlobalSetPolicyRequestResource(globalSetPolicyRequestResource)
       .build();
     ApiFuture<Policy> future = imageClient.setIamPolicyImageCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageClient this]
    (-> this (.setIamPolicyImageCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ImageClient this]
    (-> this (.isTerminated))))

(defn insert-image
  "Creates an image in the specified project using the data included in the request.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     Boolean forceCreate = false;
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     Image imageResource = Image.newBuilder().build();
     Operation response = imageClient.insertImage(forceCreate, project, imageResource);
   }

  force-create - Force image creation if true. - `java.lang.Boolean`
  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  image-resource - An Image resource. (== resource_for beta.images ==) (== resource_for v1.images ==) - `com.google.cloud.compute.v1.Image`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ImageClient this ^java.lang.Boolean force-create ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.Image image-resource]
    (-> this (.insertImage force-create project image-resource)))
  (^com.google.cloud.compute.v1.Operation [^ImageClient this ^com.google.cloud.compute.v1.InsertImageHttpRequest request]
    (-> this (.insertImage request))))

(defn delete-image-callable
  "Deletes the specified image.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     String formattedImage = ProjectGlobalImageName.format(\"[PROJECT]\", \"[IMAGE]\");
     DeleteImageHttpRequest request = DeleteImageHttpRequest.newBuilder()
       .setImage(formattedImage)
       .build();
     ApiFuture<Operation> future = imageClient.deleteImageCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageClient this]
    (-> this (.deleteImageCallable))))

(defn get-iam-policy-image-callable
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     String formattedResource = ProjectGlobalImageResourceName.format(\"[PROJECT]\", \"[RESOURCE]\");
     GetIamPolicyImageHttpRequest request = GetIamPolicyImageHttpRequest.newBuilder()
       .setResource(formattedResource)
       .build();
     ApiFuture<Policy> future = imageClient.getIamPolicyImageCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyImageHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageClient this]
    (-> this (.getIamPolicyImageCallable))))

(defn shutdown-now
  ""
  ([^ImageClient this]
    (-> this (.shutdownNow))))

(defn get-image-callable
  "Returns the specified image. Gets a list of available images by making a list() request.

   Sample code:



   try (ImageClient imageClient = ImageClient.create()) {
     String formattedImage = ProjectGlobalImageName.format(\"[PROJECT]\", \"[IMAGE]\");
     GetImageHttpRequest request = GetImageHttpRequest.newBuilder()
       .setImage(formattedImage)
       .build();
     ApiFuture<Image> future = imageClient.getImageCallable().futureCall(request);
     // Do something
     Image response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetImageHttpRequest,com.google.cloud.compute.v1.Image>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageClient this]
    (-> this (.getImageCallable))))

