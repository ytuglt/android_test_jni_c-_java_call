#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_air_testjni_NativeHelper_stringFromJNI(JNIEnv *env, jclass clazz) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT void JNICALL
Java_com_air_testjni_NativeHelper_callJava(JNIEnv *env, jclass clazz) {
    jclass cls = (*env).FindClass("com/air/testjni/NativeHelper");
    jmethodID mid = (env)->GetStaticMethodID(cls,"command1", "(F)V");
    (env)->CallStaticVoidMethod(cls,mid,0.566f);
}