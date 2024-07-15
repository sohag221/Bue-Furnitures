package com.example.buyfurniture.viewmodel

import androidx.lifecycle.ViewModel
import com.example.buyfurniture.data.Users
import com.example.buyfurniture.util.Resource
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    private val firebaseAuth: FirebaseAuth
):ViewModel() {



    private val _register = MutableStateFlow<Resource<FirebaseUser>>(Resource.Loading())

    var register:Flow<Resource<FirebaseUser>> = _register

    fun creatAccountWithEmailAndPassword(user:Users,password:String){
        firebaseAuth.createUserWithEmailAndPassword(user.email,password)
            .addOnSuccessListener{

                it.user?.let {
                    _register.value = Resource.Success(it)
                }
            }
            .addOnFailureListener {

                _register.value= Resource.Error(it.message.toString())

            }
    }








}