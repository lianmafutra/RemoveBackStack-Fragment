ft.addToBackStack(null); -->  ft.addToBackStack("dialog");

public void dismissAllDialogFragments() {
    getactivity().getSupportFragmentManager().popBackStack("dialog", FragmentManager.POP_BACK_STACK_INCLUSIVE);
}
