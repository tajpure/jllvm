/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.jllvm.bindings;

public class Target {
  public static void LLVMInitializeAllTargetInfos() {
    TargetJNI.LLVMInitializeAllTargetInfos();
  }

  public static void LLVMInitializeAllTargets() {
    TargetJNI.LLVMInitializeAllTargets();
  }

  public static void LLVMInitializeAllTargetMCs() {
    TargetJNI.LLVMInitializeAllTargetMCs();
  }

  public static void LLVMInitializeAllAsmPrinters() {
    TargetJNI.LLVMInitializeAllAsmPrinters();
  }

  public static void LLVMInitializeAllAsmParsers() {
    TargetJNI.LLVMInitializeAllAsmParsers();
  }

  public static void LLVMInitializeAllDisassemblers() {
    TargetJNI.LLVMInitializeAllDisassemblers();
  }

  public static int LLVMInitializeNativeTarget() {
    return TargetJNI.LLVMInitializeNativeTarget();
  }

  public static SWIGTYPE_p_LLVMOpaqueTargetData LLVMCreateTargetData(String StringRep) {
    int cPtr = TargetJNI.LLVMCreateTargetData(StringRep);
    return (cPtr == 0) ? null : new SWIGTYPE_p_LLVMOpaqueTargetData(cPtr, false);
  }

  public static void LLVMAddTargetData(SWIGTYPE_p_LLVMOpaqueTargetData arg0, SWIGTYPE_p_LLVMPassManagerRef arg1) {
    TargetJNI.LLVMAddTargetData(SWIGTYPE_p_LLVMOpaqueTargetData.getCPtr(arg0), SWIGTYPE_p_LLVMPassManagerRef.getCPtr(arg1));
  }

  public static void LLVMAddTargetLibraryInfo(SWIGTYPE_p_LLVMOpaqueTargetLibraryInfotData arg0, SWIGTYPE_p_LLVMPassManagerRef arg1) {
    TargetJNI.LLVMAddTargetLibraryInfo(SWIGTYPE_p_LLVMOpaqueTargetLibraryInfotData.getCPtr(arg0), SWIGTYPE_p_LLVMPassManagerRef.getCPtr(arg1));
  }

  public static String LLVMCopyStringRepOfTargetData(SWIGTYPE_p_LLVMOpaqueTargetData arg0) {
    return TargetJNI.LLVMCopyStringRepOfTargetData(SWIGTYPE_p_LLVMOpaqueTargetData.getCPtr(arg0));
  }

  public static LLVMByteOrdering LLVMByteOrder(SWIGTYPE_p_LLVMOpaqueTargetData arg0) {
    return LLVMByteOrdering.swigToEnum(TargetJNI.LLVMByteOrder(SWIGTYPE_p_LLVMOpaqueTargetData.getCPtr(arg0)));
  }

  public static int LLVMPointerSize(SWIGTYPE_p_LLVMOpaqueTargetData arg0) {
    return TargetJNI.LLVMPointerSize(SWIGTYPE_p_LLVMOpaqueTargetData.getCPtr(arg0));
  }

  public static SWIGTYPE_p_LLVMTypeRef LLVMIntPtrType(SWIGTYPE_p_LLVMOpaqueTargetData arg0) {
    return new SWIGTYPE_p_LLVMTypeRef(TargetJNI.LLVMIntPtrType(SWIGTYPE_p_LLVMOpaqueTargetData.getCPtr(arg0)), true);
  }

  public static java.math.BigInteger LLVMSizeOfTypeInBits(SWIGTYPE_p_LLVMOpaqueTargetData arg0, SWIGTYPE_p_LLVMTypeRef arg1) {
    return TargetJNI.LLVMSizeOfTypeInBits(SWIGTYPE_p_LLVMOpaqueTargetData.getCPtr(arg0), SWIGTYPE_p_LLVMTypeRef.getCPtr(arg1));
  }

  public static java.math.BigInteger LLVMStoreSizeOfType(SWIGTYPE_p_LLVMOpaqueTargetData arg0, SWIGTYPE_p_LLVMTypeRef arg1) {
    return TargetJNI.LLVMStoreSizeOfType(SWIGTYPE_p_LLVMOpaqueTargetData.getCPtr(arg0), SWIGTYPE_p_LLVMTypeRef.getCPtr(arg1));
  }

  public static java.math.BigInteger LLVMABISizeOfType(SWIGTYPE_p_LLVMOpaqueTargetData arg0, SWIGTYPE_p_LLVMTypeRef arg1) {
    return TargetJNI.LLVMABISizeOfType(SWIGTYPE_p_LLVMOpaqueTargetData.getCPtr(arg0), SWIGTYPE_p_LLVMTypeRef.getCPtr(arg1));
  }

  public static int LLVMABIAlignmentOfType(SWIGTYPE_p_LLVMOpaqueTargetData arg0, SWIGTYPE_p_LLVMTypeRef arg1) {
    return TargetJNI.LLVMABIAlignmentOfType(SWIGTYPE_p_LLVMOpaqueTargetData.getCPtr(arg0), SWIGTYPE_p_LLVMTypeRef.getCPtr(arg1));
  }

  public static int LLVMCallFrameAlignmentOfType(SWIGTYPE_p_LLVMOpaqueTargetData arg0, SWIGTYPE_p_LLVMTypeRef arg1) {
    return TargetJNI.LLVMCallFrameAlignmentOfType(SWIGTYPE_p_LLVMOpaqueTargetData.getCPtr(arg0), SWIGTYPE_p_LLVMTypeRef.getCPtr(arg1));
  }

  public static int LLVMPreferredAlignmentOfType(SWIGTYPE_p_LLVMOpaqueTargetData arg0, SWIGTYPE_p_LLVMTypeRef arg1) {
    return TargetJNI.LLVMPreferredAlignmentOfType(SWIGTYPE_p_LLVMOpaqueTargetData.getCPtr(arg0), SWIGTYPE_p_LLVMTypeRef.getCPtr(arg1));
  }

  public static int LLVMPreferredAlignmentOfGlobal(SWIGTYPE_p_LLVMOpaqueTargetData arg0, SWIGTYPE_p_LLVMValueRef GlobalVar) {
    return TargetJNI.LLVMPreferredAlignmentOfGlobal(SWIGTYPE_p_LLVMOpaqueTargetData.getCPtr(arg0), SWIGTYPE_p_LLVMValueRef.getCPtr(GlobalVar));
  }

  public static int LLVMElementAtOffset(SWIGTYPE_p_LLVMOpaqueTargetData arg0, SWIGTYPE_p_LLVMTypeRef StructTy, java.math.BigInteger Offset) {
    return TargetJNI.LLVMElementAtOffset(SWIGTYPE_p_LLVMOpaqueTargetData.getCPtr(arg0), SWIGTYPE_p_LLVMTypeRef.getCPtr(StructTy), Offset);
  }

  public static java.math.BigInteger LLVMOffsetOfElement(SWIGTYPE_p_LLVMOpaqueTargetData arg0, SWIGTYPE_p_LLVMTypeRef StructTy, int Element) {
    return TargetJNI.LLVMOffsetOfElement(SWIGTYPE_p_LLVMOpaqueTargetData.getCPtr(arg0), SWIGTYPE_p_LLVMTypeRef.getCPtr(StructTy), Element);
  }

  public static void LLVMDisposeTargetData(SWIGTYPE_p_LLVMOpaqueTargetData arg0) {
    TargetJNI.LLVMDisposeTargetData(SWIGTYPE_p_LLVMOpaqueTargetData.getCPtr(arg0));
  }

}
