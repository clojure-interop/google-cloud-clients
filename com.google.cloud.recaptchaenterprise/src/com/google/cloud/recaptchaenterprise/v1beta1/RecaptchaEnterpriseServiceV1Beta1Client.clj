(ns com.google.cloud.recaptchaenterprise.v1beta1.RecaptchaEnterpriseServiceV1Beta1Client
  "Service Description: Service to determine the likelihood an event is legitimate.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (RecaptchaEnterpriseServiceV1Beta1Client recaptchaEnterpriseServiceV1Beta1Client = RecaptchaEnterpriseServiceV1Beta1Client.create()) {
    ProjectName parent = ProjectName.of(\"[PROJECT]\");
    Assessment assessment = Assessment.newBuilder().build();
    Assessment response = recaptchaEnterpriseServiceV1Beta1Client.createAssessment(parent, assessment);
  }

  Note: close() needs to be called on the recaptchaEnterpriseServiceV1Beta1Client object to
  clean up resources such as threads. In the example above, try-with-resources is used, which
  automatically calls close().

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

  This class can be customized by passing in a custom instance of
  RecaptchaEnterpriseServiceV1Beta1Settings to create(). For example:

  To customize credentials:



  RecaptchaEnterpriseServiceV1Beta1Settings recaptchaEnterpriseServiceV1Beta1Settings =
      RecaptchaEnterpriseServiceV1Beta1Settings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  RecaptchaEnterpriseServiceV1Beta1Client recaptchaEnterpriseServiceV1Beta1Client =
      RecaptchaEnterpriseServiceV1Beta1Client.create(recaptchaEnterpriseServiceV1Beta1Settings);

  To customize the endpoint:



  RecaptchaEnterpriseServiceV1Beta1Settings recaptchaEnterpriseServiceV1Beta1Settings =
      RecaptchaEnterpriseServiceV1Beta1Settings.newBuilder().setEndpoint(myEndpoint).build();
  RecaptchaEnterpriseServiceV1Beta1Client recaptchaEnterpriseServiceV1Beta1Client =
      RecaptchaEnterpriseServiceV1Beta1Client.create(recaptchaEnterpriseServiceV1Beta1Settings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.recaptchaenterprise.v1beta1 RecaptchaEnterpriseServiceV1Beta1Client]))

(defn *create
  "Constructs an instance of RecaptchaEnterpriseServiceV1Beta1Client, using the given settings.
   The channels are created based on the settings passed in, or defaults for any settings that are
   not set.

  settings - `com.google.cloud.recaptchaenterprise.v1beta1.RecaptchaEnterpriseServiceV1Beta1Settings`

  returns: `com.google.cloud.recaptchaenterprise.v1beta1.RecaptchaEnterpriseServiceV1Beta1Client`

  throws: java.io.IOException"
  (^com.google.cloud.recaptchaenterprise.v1beta1.RecaptchaEnterpriseServiceV1Beta1Client [^com.google.cloud.recaptchaenterprise.v1beta1.RecaptchaEnterpriseServiceV1Beta1Settings settings]
    (RecaptchaEnterpriseServiceV1Beta1Client/create settings))
  (^com.google.cloud.recaptchaenterprise.v1beta1.RecaptchaEnterpriseServiceV1Beta1Client []
    (RecaptchaEnterpriseServiceV1Beta1Client/create )))

(defn annotate-assessment-callable
  "Annotates a previously created Assessment to provide additional information on whether the
   event turned out to be authentic or fradulent.

   Sample code:



   try (RecaptchaEnterpriseServiceV1Beta1Client recaptchaEnterpriseServiceV1Beta1Client = RecaptchaEnterpriseServiceV1Beta1Client.create()) {
     AssessmentName name = AssessmentName.of(\"[PROJECT]\", \"[ASSESSMENT]\");
     AnnotateAssessmentRequest.Annotation annotation = AnnotateAssessmentRequest.Annotation.ANNOTATION_UNSPECIFIED;
     AnnotateAssessmentRequest request = AnnotateAssessmentRequest.newBuilder()
       .setName(name.toString())
       .setAnnotation(annotation)
       .build();
     ApiFuture<AnnotateAssessmentResponse> future = recaptchaEnterpriseServiceV1Beta1Client.annotateAssessmentCallable().futureCall(request);
     // Do something
     AnnotateAssessmentResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest,com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RecaptchaEnterpriseServiceV1Beta1Client this]
    (-> this (.annotateAssessmentCallable))))

(defn get-settings
  "returns: `com.google.cloud.recaptchaenterprise.v1beta1.RecaptchaEnterpriseServiceV1Beta1Settings`"
  (^com.google.cloud.recaptchaenterprise.v1beta1.RecaptchaEnterpriseServiceV1Beta1Settings [^RecaptchaEnterpriseServiceV1Beta1Client this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.recaptchaenterprise.v1beta1.stub.RecaptchaEnterpriseServiceV1Beta1Stub`"
  ([^RecaptchaEnterpriseServiceV1Beta1Client this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^RecaptchaEnterpriseServiceV1Beta1Client this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^RecaptchaEnterpriseServiceV1Beta1Client this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^RecaptchaEnterpriseServiceV1Beta1Client this]
    (-> this (.shutdown))))

(defn annotate-assessment
  "Annotates a previously created Assessment to provide additional information on whether the
   event turned out to be authentic or fradulent.

   Sample code:



   try (RecaptchaEnterpriseServiceV1Beta1Client recaptchaEnterpriseServiceV1Beta1Client = RecaptchaEnterpriseServiceV1Beta1Client.create()) {
     AssessmentName name = AssessmentName.of(\"[PROJECT]\", \"[ASSESSMENT]\");
     AnnotateAssessmentRequest.Annotation annotation = AnnotateAssessmentRequest.Annotation.ANNOTATION_UNSPECIFIED;
     AnnotateAssessmentResponse response = recaptchaEnterpriseServiceV1Beta1Client.annotateAssessment(name, annotation);
   }

  name - Required. The resource name of the Assessment, in the format \"projects/{project_number}/assessments/{assessment_id}\". - `com.google.recaptchaenterprise.v1beta1.AssessmentName`
  annotation - The annotation that will be assigned to the Event. - `com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest$Annotation`

  returns: `com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse [^RecaptchaEnterpriseServiceV1Beta1Client this ^com.google.recaptchaenterprise.v1beta1.AssessmentName name ^com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest$Annotation annotation]
    (-> this (.annotateAssessment name annotation)))
  (^com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse [^RecaptchaEnterpriseServiceV1Beta1Client this ^com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest request]
    (-> this (.annotateAssessment request))))

(defn close
  ""
  ([^RecaptchaEnterpriseServiceV1Beta1Client this]
    (-> this (.close))))

(defn create-assessment-callable
  "Creates an Assessment of the likelihood an event is legitimate.

   Sample code:



   try (RecaptchaEnterpriseServiceV1Beta1Client recaptchaEnterpriseServiceV1Beta1Client = RecaptchaEnterpriseServiceV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     Assessment assessment = Assessment.newBuilder().build();
     CreateAssessmentRequest request = CreateAssessmentRequest.newBuilder()
       .setParent(parent.toString())
       .setAssessment(assessment)
       .build();
     ApiFuture<Assessment> future = recaptchaEnterpriseServiceV1Beta1Client.createAssessmentCallable().futureCall(request);
     // Do something
     Assessment response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest,com.google.recaptchaenterprise.v1beta1.Assessment>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RecaptchaEnterpriseServiceV1Beta1Client this]
    (-> this (.createAssessmentCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^RecaptchaEnterpriseServiceV1Beta1Client this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^RecaptchaEnterpriseServiceV1Beta1Client this]
    (-> this (.shutdownNow))))

(defn create-assessment
  "Creates an Assessment of the likelihood an event is legitimate.

   Sample code:



   try (RecaptchaEnterpriseServiceV1Beta1Client recaptchaEnterpriseServiceV1Beta1Client = RecaptchaEnterpriseServiceV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     Assessment assessment = Assessment.newBuilder().build();
     Assessment response = recaptchaEnterpriseServiceV1Beta1Client.createAssessment(parent, assessment);
   }

  parent - Required. The name of the project in which the assessment will be created, in the format \"projects/{project_number}\". - `com.google.recaptchaenterprise.v1beta1.ProjectName`
  assessment - The asessment details. - `com.google.recaptchaenterprise.v1beta1.Assessment`

  returns: `com.google.recaptchaenterprise.v1beta1.Assessment`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.recaptchaenterprise.v1beta1.Assessment [^RecaptchaEnterpriseServiceV1Beta1Client this ^com.google.recaptchaenterprise.v1beta1.ProjectName parent ^com.google.recaptchaenterprise.v1beta1.Assessment assessment]
    (-> this (.createAssessment parent assessment)))
  (^com.google.recaptchaenterprise.v1beta1.Assessment [^RecaptchaEnterpriseServiceV1Beta1Client this ^com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest request]
    (-> this (.createAssessment request))))

